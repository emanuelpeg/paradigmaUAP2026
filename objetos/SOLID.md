# Principios SOLID de Programación Orientada a Objetos

Los principios SOLID son cinco reglas fundamentales para escribir código orientado a objetos mantenible, escalable y robusto. Fueron introducidos por Robert C. Martin y representan las mejores prácticas para el diseño de software.

## S - Single Responsibility Principle (Principio de Responsabilidad Única)

**Definición:** Una clase debe tener una sola razón para cambiar, es decir, una sola responsabilidad.

### Ejemplo Malo:

```typescript
class Usuario {
  private nombre: string;
  private email: string;

  constructor(nombre: string, email: string) {
    this.nombre = nombre;
    this.email = email;
  }

  public guardarEnBaseDatos(): void {
    // Lógica para guardar en BD
    const connection = new DatabaseConnection("...");
    // ... código SQL
  }

  public enviarEmail(): void {
    // Lógica para enviar email
    const smtp = new SMTPClient();
    // ... código de email
  }

  public validarDatos(): void {
    // Lógica de validación
    if (!this.email || !this.email.includes("@")) {
      throw new Error("Email inválido");
    }
  }
}
```

**¿Por qué es malo?**

- La clase `Usuario` tiene múltiples responsabilidades: persistencia, comunicación y validación
- Si cambia la base de datos, el servidor de email o las reglas de validación, hay que modificar esta clase
- Es difícil de testear porque mezcla diferentes conceptos
- Viola el principio de cohesión: los métodos no están relacionados entre sí

### Ejemplo Bueno:

```typescript
class Usuario {
  constructor(private nombre: string, private email: string) {}

  // Solo getters y lógica propia del usuario
  public getNombre(): string {
    return this.nombre;
  }
  public getEmail(): string {
    return this.email;
  }
}

class RepositorioUsuario {
  public async guardar(usuario: Usuario): Promise<void> {
    const connection = new DatabaseConnection("...");
    // ... código SQL específico para persistencia
  }
}

class ServicioEmail {
  public async enviar(destinatario: string, mensaje: string): Promise<void> {
    const smtp = new SMTPClient();
    // ... código específico para email
  }
}

class ValidadorUsuario {
  public validar(usuario: Usuario): void {
    if (!usuario.getEmail() || !usuario.getEmail().includes("@")) {
      throw new Error("Email inválido");
    }
  }
}
```

**¿Por qué es bueno?**

- Cada clase tiene una sola responsabilidad bien definida
- Los cambios en persistencia, email o validación no afectan otras clases
- Es más fácil testear cada componente por separado
- Mayor cohesión y menor acoplamiento

## O - Open/Closed Principle (Principio Abierto/Cerrado)

**Definición:** Las entidades de software deben estar abiertas para extensión pero cerradas para modificación.

### Ejemplo:

```typescript
// Clase base cerrada para modificación
abstract class Forma {
  abstract calcularArea(): number;
}

// Extensiones que no modifican la clase base
class Rectangulo extends Forma {
  constructor(private ancho: number, private alto: number) {
    super();
  }

  calcularArea(): number {
    return this.ancho * this.alto;
  }
}

class Circulo extends Forma {
  constructor(private radio: number) {
    super();
  }

  calcularArea(): number {
    return Math.PI * this.radio * this.radio;
  }
}

// Agregar nuevas formas sin modificar código existente
class Triangulo extends Forma {
  constructor(private base: number, private altura: number) {
    super();
  }

  calcularArea(): number {
    return (this.base * this.altura) / 2;
  }
}

// Calculadora que funciona con cualquier forma
class CalculadoraAreas {
  public calcularAreaTotal(formas: Forma[]): number {
    return formas.reduce((total, forma) => total + forma.calcularArea(), 0);
  }
}
```

**¿Por qué es bueno?**

- Podemos agregar nuevas formas (Triángulo, Hexágono, etc.) sin modificar `Forma` o `CalculadoraAreas`
- El código existente permanece intacto y funcional
- Reduce el riesgo de introducir bugs en funcionalidad que ya trabajaba
- Facilita el mantenimiento y la extensibilidad

## L - Liskov Substitution Principle (Principio de Sustitución de Liskov)

**Definición:** Los objetos de una clase derivada deben poder reemplazar objetos de la clase base sin alterar la funcionalidad del programa.

### Ejemplo Malo:

```typescript
class Ave {
  public volar(): void {
    console.log("El ave está volando");
  }
}

class Pinguino extends Ave {
  public volar(): void {
    throw new Error("Los pingüinos no pueden volar");
  }
}

// Código cliente que se rompe
class ControladorVuelo {
  public hacerVolar(ave: Ave): void {
    ave.volar(); // ¡Explota si ave es un Pingüino!
  }
}
```

**¿Por qué es malo?**

- `Pingüino` no puede sustituir a `Ave` sin cambiar el comportamiento
- El código cliente no puede usar `Pingüino` donde espera un `Ave`
- Viola las expectativas: si algo es un `Ave`, debería poder volar
- Requiere verificaciones de tipo en el código cliente

### Ejemplo Bueno:

```typescript
abstract class Ave {
  public abstract moverse(): void;
  public abstract comer(): void;
}

class AveVoladora extends Ave {
  public volar(): void {
    console.log("Volando por el cielo");
  }

  public moverse(): void {
    this.volar();
  }

  public comer(): void {
    console.log("Comiendo en vuelo o posada");
  }
}

class AveTerrestre extends Ave {
  public caminar(): void {
    console.log("Caminando por el suelo");
  }

  public moverse(): void {
    this.caminar();
  }

  public comer(): void {
    console.log("Comiendo en el suelo");
  }
}

class Aguila extends AveVoladora {}
class Pinguino extends AveTerrestre {}

// Código cliente que funciona con cualquier ave
class ControladorAnimales {
  public activarAve(ave: Ave): void {
    ave.moverse(); // Funciona correctamente para cualquier ave
    ave.comer();
  }
}
```

**¿Por qué es bueno?**

- Cualquier subclase de `Ave` puede sustituir a la clase base
- El comportamiento es consistente y predecible
- No hay excepciones inesperadas
- El código cliente funciona con cualquier tipo de ave

## I - Interface Segregation Principle (Principio de Segregación de Interfaces)

**Definición:** Los clientes no deben ser forzados a depender de interfaces que no usan.

### Ejemplo Malo:

```typescript
interface Trabajador {
  trabajar(): void;
  comer(): void;
  dormir(): void;
  cobrarSalario(): void;
  tomarVacaciones(): void;
}

// Robot debe implementar métodos que no necesita
class Robot implements Trabajador {
  public trabajar(): void {
    /* implementación */
  }

  public comer(): void {
    throw new Error("Los robots no comen");
  }

  public dormir(): void {
    throw new Error("Los robots no duermen");
  }

  public cobrarSalario(): void {
    throw new Error("Los robots no cobran");
  }

  public tomarVacaciones(): void {
    throw new Error("Los robots no toman vacaciones");
  }
}
```

**¿Por qué es malo?**

- `Robot` debe implementar métodos que no son relevantes para él
- Crea dependencias innecesarias
- Genera código muerto o excepciones
- Viola el principio de responsabilidad única a nivel de interfaz

### Ejemplo Bueno:

```typescript
// Interfaces pequeñas y específicas
interface Trabajable {
  trabajar(): void;
}

interface Alimentable {
  comer(): void;
}

interface Descansable {
  dormir(): void;
}

interface Empleado {
  cobrarSalario(): void;
  tomarVacaciones(): void;
}

// Cada clase implementa solo lo que necesita
class Robot implements Trabajable {
  public trabajar(): void {
    console.log("Robot trabajando 24/7");
  }
}

class Humano implements Trabajable, Alimentable, Descansable, Empleado {
  public trabajar(): void {
    console.log("Humano trabajando");
  }
  public comer(): void {
    console.log("Humano comiendo");
  }
  public dormir(): void {
    console.log("Humano durmiendo");
  }
  public cobrarSalario(): void {
    console.log("Cobrando salario");
  }
  public tomarVacaciones(): void {
    console.log("De vacaciones");
  }
}

class Animal implements Alimentable, Descansable {
  public comer(): void {
    console.log("Animal comiendo");
  }
  public dormir(): void {
    console.log("Animal durmiendo");
  }
}
```

**¿Por qué es bueno?**

- Cada clase implementa solo las interfaces que realmente necesita
- Mayor flexibilidad y composición
- Interfaces más cohesivas y específicas
- Elimina dependencias innecesarias

## D - Dependency Inversion Principle (Principio de Inversión de Dependencias)

**Definición:** Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

### Ejemplo Malo:

```typescript
// Dependencia concreta de bajo nivel
class NotificacionEmail {
  public enviar(mensaje: string): void {
    console.log("Enviando email: " + mensaje);
  }
}

// Módulo de alto nivel depende directamente del bajo nivel
class ServicioUsuario {
  private notificacion = new NotificacionEmail(); // ¡Acoplamiento fuerte!

  public registrarUsuario(nombre: string): void {
    // Lógica de registro
    console.log("Usuario registrado: " + nombre);

    // Notificación rígidamente acoplada
    this.notificacion.enviar("Bienvenido " + nombre);
  }
}
```

**¿Por qué es malo?**

- `ServicioUsuario` está fuertemente acoplado a `NotificacionEmail`
- Es difícil cambiar el tipo de notificación (SMS, Push, etc.)
- Imposible testear sin enviar emails reales
- Viola el principio abierto/cerrado para cambios de notificación

### Ejemplo Bueno:

```typescript
// Abstracción
interface INotificacion {
  enviar(mensaje: string): void;
}

// Implementaciones concretas
class NotificacionEmail implements INotificacion {
  public enviar(mensaje: string): void {
    console.log("Enviando email: " + mensaje);
  }
}

class NotificacionSMS implements INotificacion {
  public enviar(mensaje: string): void {
    console.log("Enviando SMS: " + mensaje);
  }
}

class NotificacionPush implements INotificacion {
  public enviar(mensaje: string): void {
    console.log("Enviando notificación push: " + mensaje);
  }
}

// Módulo de alto nivel depende de la abstracción
class ServicioUsuario {
  constructor(private notificacion: INotificacion) {}

  public registrarUsuario(nombre: string): void {
    console.log("Usuario registrado: " + nombre);
    this.notificacion.enviar("Bienvenido " + nombre);
  }
}

// Uso flexible
class Main {
  public static main(): void {
    // Podemos cambiar fácilmente el tipo de notificación
    const servicio1 = new ServicioUsuario(new NotificacionEmail());
    const servicio2 = new ServicioUsuario(new NotificacionSMS());
    const servicio3 = new ServicioUsuario(new NotificacionPush());
  }
}
```

**¿Por qué es bueno?**

- `ServicioUsuario` no depende de implementaciones concretas
- Fácil intercambio de tipos de notificación sin modificar el servicio
- Facilita el testing con mocks
- Mayor flexibilidad y extensibilidad
- Respeta el principio abierto/cerrado

## Beneficios de Aplicar SOLID

Aplicar estos principios resulta en:

- **Código más mantenible:** Cambios localizados y predecibles
- **Mayor testabilidad:** Componentes independientes y mockeables
- **Mejor extensibilidad:** Fácil agregar nueva funcionalidad
- **Menor acoplamiento:** Componentes independientes
- **Mayor cohesión:** Responsabilidades bien definidas
- **Código más robusto:** Menos propenso a errores y efectos colaterales

Los principios SOLID no son reglas absolutas, sino guías que ayudan a tomar mejores decisiones de diseño. La clave está en encontrar el equilibrio correcto para cada situación específica.
