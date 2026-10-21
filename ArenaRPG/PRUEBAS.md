# Comprobaciones ejecutadas

Entorno verificado: Microsoft OpenJDK 21.0.12.1. Compilación de las ocho clases principales y del ejecutable de pruebas mediante javac, codificación UTF-8 y -Xlint:all: sin errores ni advertencias.

Resultado real: **24 comprobaciones aprobadas** al ejecutar org.example.PruebasArena. Registro de consola: target/resultado-pruebas.txt (archivo generado localmente, no necesario para ejecutar el juego).

| Comprobación | Resultado |
|---|---|
| Defensa del escudo y daño mínimo cero | Aprobado (2) |
| Sobrecarga normal y furia | Aprobado (2) |
| Hechizo: daño, defensa y consumo de mana | Aprobado |
| Mana insuficiente usa ataque básico | Aprobado |
| Objetivo null no consume mana | Aprobado |
| Vida mínima cero y rechazo de objetivo caído | Aprobado |
| Curación limitada a vida máxima | Aprobado |
| Poción cura y desaparece del inventario | Aprobado |
| Inventario vacío | Aprobado |
| Coordenadas fuera del tablero | Aprobado |
| Saltos y diagonales rechazados | Aprobado |
| Movimiento actualiza origen y destino | Aprobado |
| Ocupación por aliado y enemigo | Aprobado (2) |
| removeIf elimina caídos y libera mapa; enemigos eliminados no bastan para ganar | Aprobado |
| Llegada al cofre tras eliminar enemigos | Aprobado |
| Cofre con enemigos vivos no da victoria | Aprobado |
| Caída del principal y escuadrón vacío | Aprobado (2) |
| Texto, opción e índice inválidos; entrada agotada | Aprobado |
| Partida completa con Scanner, menú, turnos enemigos, poción, exploración y victoria | Aprobado |
| Partida completa por menú hasta derrota | Aprobado |

La partida ganadora usa una poción cuando Thorin tiene 22 de vida. Atacar sin curarse produce una derrota comprobada; las pociones tienen una utilidad real.

No se ejecutó Maven ni se utilizó la interfaz de IntelliJ IDEA para depurar. Los pasos con breakpoints, F7, F8 y Alt+F8 están documentados en DEPURACION.md para realizar la práctica. Las pruebas automatizadas no se presentan como evidencia del uso del depurador.
