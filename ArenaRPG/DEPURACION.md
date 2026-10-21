# Guía de depuración en IntelliJ IDEA

Estos pasos son una guía para realizar la práctica. No se han ejecutado ni capturado en la interfaz de IntelliJ durante esta entrega.

1. Pon breakpoints haciendo clic en el margen izquierdo: en Guerrero.realizarAtaqueEspecial, Mago.realizarAtaqueEspecial y en el inicio del do-while de Arena.jugar.
2. Ejecuta Main en Debug con Shift+F9. Al llegar al menú, elige atacar y un enemigo.
3. Usa F8 (Step Over) para avanzar y F7 (Step Into) para entrar en atacar, defender y recibirDano. Comprueba la vida antes y después y el bloqueo del escudo.
4. En Variables, despliega this, heroes, enemigos y sus objetos. Observa los atributos heredados, las coordenadas y puntosMana del mago.
5. Con Alt+F8 (Evaluate Expression), dentro de Arena, evalúa heroes.size(), heroes.get(0).estaVivo(), enemigos.size() y tablero[2][2]. Para puntosMana, despliega el objeto Mago en Variables.
6. Para un breakpoint condicional, usa clic derecho sobre el breakpoint de mover y la condición x < 0 || x >= 5 || y < 0 || y >= 5. Introduce una coordenada inválida y observa que se rechaza antes de acceder a la matriz.

| Error del taller | Inspección y prevención |
|---|---|
| IndexOutOfBoundsException | observa indice y objetivos.size(); el menú valida 1..size antes de get(indice - 1) |
| ArrayIndexOutOfBoundsException | observa x/y; mover valida 0..4 antes de tablero[y][x] |
| ClassCastException / tipos | Inventario<Pocion> recupera Pocion sin casteos; no usar listas crudas |
| Instanciar clase abstracta | Personaje no se instancia; los new crean Guerrero o Mago |
| NullPointerException | objetivos null se rechazan y el tablero contiene caracteres, no referencias a personajes |
| Modificar lista al recorrer | removeIf se ejecuta fuera de los bucles for-each de combate |

Como demostración de seguridad de tipos, intentar agregar un String a Inventario<Pocion> debe dar error de compilación. No dejes esa línea inválida en el proyecto final.
