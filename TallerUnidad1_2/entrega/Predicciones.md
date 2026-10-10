# Predicciones antes de ejecutar
Cada fila parte independientemente de x = 7 y flag = false.

| Expresión | Predicción | Razón |
| --- | --- | --- |
| 86400 % 3600 | seg = 0 | La división es exacta, no queda residuo. |
| ++x + x++ | y = 16; x = 9 | El prefijo da 8; el posfijo usa 8 y luego sube a 9. |
| 15 / 2; 15.0 / 2 | div1 = 7.0; div2 = 7.5 | La primera división es entera y la segunda decimal. |
| flag && (++x > 0) | res = false; x = 7 | Por cortocircuito no se evalúa el incremento. |

Registro realizado antes de compilar o ejecutar los ejercicios.
