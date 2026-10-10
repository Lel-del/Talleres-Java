# TallerUnidad1_2
Taller de operadores y estructuras de decisión con Java básico.

## Abrir y ejecutar en IntelliJ IDEA
1. Abrir la carpeta C:\Users\usuario\IdeaProjects\untitled mediante File > Open. Si ya estaba abierta antes de los cambios, cerrarla y abrirla de nuevo.
2. El nombre visible del proyecto es TallerUnidad1_2. La carpeta permanece en la ubicación solicitada.
3. El sistema de construcción es IntelliJ y el JDK configurado es Microsoft OpenJDK 21 (ms-21).
4. Abrir src/com/taller/practico/Main.java. Clic en el triángulo verde junto a main > Run 'Main.main()'.
5. Introducir un número del 1 al 7 en la consola y presionar Enter. Los dos switch muestran el mismo día y jornada. Un entero fuera de ese rango muestra Día no válido.
6. Ejecutar por separado las cuatro clases Error... de ese mismo paquete.

## Contenido
- Sección 1: operadores, con estado independiente por fila. Tabla escrita y resultados en entrega/.
- Sección 2: clasificación de edad, nota/asistencia/proyecto, tarifas y operador ternario. Para probar otros ejemplos se cambian las variables indicadas en Main.
- Sección 3: switch tradicional con break/default y expresión switch moderna con flechas, ambos en Main.
- Sección 4: cálculo de compra con switch, if-else, cupón literal PROMO1 año e IVA del 16%. Los dos casos están escritos directamente en Main.
- Sección 5: cuatro clases independientes corregidas, explicación y guía de depuración.

La guía no define una jornada especial para sábado; se interpreta de lunes a viernes como Jornada Laboral y sábado/domingo como Fin de Semana.
No se agregan funciones de inventario adicionales, pues el reto solicita los cálculos de compra.

## Verificación realizada
Compilación correcta con JDK 21. Tabla de operadores confirmada. Días 1 a 7 y entradas enteras 0/8 verificadas en ambos switch. Casos A y B: $638.00 y $275.50. Las cuatro correcciones producen sus salidas esperadas. Se comprobaron además límites de edad, aprobación/recuperación/reprobación, cuatro tarifas y ambas ramas del ternario, utilizando copias temporales sin cambiar los ejemplos entregados.

## Pendiente para cumplir la parte presencial del taller
Repetir la ejecución desde IntelliJ y utilizar sus breakpoints, F8 y Alt + F8 siguiendo entrega/Depuracion.md. No se ha realizado esa interacción con la ventana del IDE desde esta sesión.
