# Análisis de los cuatro errores
Las clases del paquete com.taller.practico contienen las versiones corregidas.

| Clase | Error original | Corrección | Resultado verificado |
| --- | --- | --- | --- |
| ErrorAsignacion | if (cookieActiva = true) asigna true; entra siempre en el if. | if (cookieActiva == true) compara sin asignar. | Sesión inactiva; cookieActiva sigue false. |
| ErrorComparacionString | proveedor1 == proveedor2 compara referencias de objetos distintos. | proveedor1.equals(proveedor2) compara el contenido. | Los proveedores coinciden exactamente. |
| ErrorFallThrough | Faltan break: se ejecutan los casos 1, 2, 3 y default. | Añadir break después de cada caso. | Solo imprime Lunes. |
| ErrorPrecision | (3 / 4) * 100 divide enteros y da 0. | ((double) tareasCompletadas / tareasTotales) * 100. | 75.0%. |

## Comprobación requerida dentro de IntelliJ (pendiente)
1. Abrir cada clase y poner un breakpoint en la primera instrucción del main, haciendo clic junto al número de línea.
2. Clic derecho en la clase > Debug 'NombreDeLaClase.main()'.
3. Usar F8 para avanzar y mirar el panel Variables.
4. Usar Alt + F8 para evaluar las expresiones indicadas abajo.

- ErrorAsignacion: inspeccionar cookieActiva = false. Evaluar cookieActiva == true: false. Al avanzar entra en else y la variable no cambia.
- ErrorComparacionString: evaluar proveedor1 == proveedor2: false; proveedor1.equals(proveedor2): true.
- ErrorFallThrough: inspeccionar opcionCategoria = 1. Avanzar sobre la impresión y break: no se ejecutan las impresiones de Martes, Miércoles ni default.
- ErrorPrecision: evaluar tareasCompletadas / tareasTotales: 0; (double) tareasCompletadas / tareasTotales: 0.75. Avanzar y observar porcentajeAvance = 75.0.

No se afirma que se hayan utilizado F8 ni breakpoints en IntelliJ: esa interacción no pudo realizarse desde esta sesión. Sí se compilaron y ejecutaron las cuatro soluciones con JDK 21.
