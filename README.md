# Programa de Gestión de Personas en Java
## Implementación de Conceptos de Programación Orientada a Objetos

### Introducción
Este proyecto demuestra la implementación de los conceptos fundamentales de la Programación Orientada a Objetos (POO) utilizando Java como lenguaje de programación. El programa desarrollado permite gestionar información de personas, capturando y procesando datos como nombre, apellido, género y edad.

#### Objetivos
- Implementar los conceptos básicos de POO en Java
- Demostrar el uso de encapsulamiento mediante atributos privados
- Utilizar constructores para la creación de objetos
- Implementar métodos para el procesamiento de datos
- Gestionar múltiples instancias de objetos

### Desarrollo

#### Estructura del Programa
El proyecto está compuesto por dos clases principales:

1. **Clase Persona**
   - Atributos privados:
     - nombre (String)
     - apellido (String)
     - genero (String)
     - edad (int)
   - Constructor público para la creación de instancias
   - Métodos getters para acceder a los atributos

2. **Clase Main**
   - Implementa la lógica principal del programa
   - Métodos implementados:
     - capturarPersonas(): Captura datos de 5 personas
     - mostrarNombresYGeneros(): Muestra nombres y géneros
     - calcularPromedioEdades(): Calcula el promedio de edades
     - contarPersonasPorGenero(): Cuenta personas por género

#### Conceptos de POO Implementados

1. **Encapsulamiento**
   - Los atributos de la clase Persona son privados
   - Acceso controlado mediante métodos getters
   - Protección de datos mediante modificadores de acceso

2. **Constructores**
   - Constructor parametrizado para inicialización directa
   - Asignación de valores mediante this

3. **Métodos**
   - Métodos estáticos para operaciones generales
   - Métodos de instancia para operaciones específicas
   - Implementación de lógica de negocio

### Funcionalidades

1. **Captura de Datos**
   - Entrada de datos mediante consola
   - Validación de tipos de datos
   - Almacenamiento en estructura de datos

2. **Procesamiento de Información**
   - Cálculo de promedios
   - Conteo por categorías
   - Visualización de resultados

3. **Gestión de Múltiples Instancias**
   - Manejo de colección de objetos
   - Procesamiento en lote
   - Análisis de datos

### Conclusiones

#### Logros Alcanzados
- Implementación exitosa de conceptos POO
- Desarrollo de un sistema funcional de gestión
- Aplicación práctica de encapsulamiento
- Manejo eficiente de múltiples instancias

#### Aprendizajes
- Uso efectivo de modificadores de acceso
- Implementación de constructores
- Gestión de colecciones de objetos
- Procesamiento de datos en Java

#### Mejoras Futuras
- Implementación de validación de datos
- Adición de persistencia de datos
- Desarrollo de interfaz gráfica
- Implementación de más funcionalidades de análisis

### Requisitos Técnicos
- Java Development Kit (JDK) 8 o superior
- IDE compatible con Java (recomendado: IntelliJ IDEA, Eclipse, o NetBeans)

### Instrucciones de Uso
1. Compilar los archivos:
   ```bash
   javac Persona.java Main.java
   ```
2. Ejecutar el programa:
   ```bash
   java Main
   ```
3. Seguir las instrucciones en pantalla para ingresar los datos 