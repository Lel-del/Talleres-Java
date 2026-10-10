package com.taller.practico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        boolean flag = false;
        int seg = 86400 % 3600;
        System.out.println("SECCIÓN 1: OPERADORES");
        System.out.println("seg = " + seg);
        x = 7;
        int y = ++x + x++;
        System.out.println("y = " + y + "; x = " + x);
        double div1 = 15 / 2;
        double div2 = 15.0 / 2;
        System.out.println("div1 = " + div1 + "; div2 = " + div2);
        x = 7;
        flag = false;
        boolean res = flag && (++x > 0);
        System.out.println("res = " + res + "; x = " + x);

        System.out.println("\nSECCIÓN 2: DECISIONES");
        int edadUsuario = 15;
        if (edadUsuario < 12) {
            System.out.println("Infante: requiere tutor de cuenta.");
        } else if (edadUsuario <= 17) {
            System.out.println("Adolescente: acceso restringido a foros comunitarios.");
        } else if (edadUsuario <= 64) {
            System.out.println("Adulto: acceso a funcionalidades estándar.");
        } else {
            System.out.println("Adulto Mayor: acceso con interfaz adaptada.");
        }

        double calificacionFinal = 65.0;
        int porcentajeAsistencia = 75;
        boolean entregoProyectoFinal = true;
        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            System.out.println("Aprobado");
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            System.out.println("Pendiente de Examen Extraordinario");
        } else {
            System.out.println("Reprobado");
        }

        String tipoEntrada = "ESTUDIANTE";
        double precioBase = 100.0;
        double precioFinal;
        if (tipoEntrada.equals("VIP")) {
            precioFinal = precioBase * 1.10;
        } else if (tipoEntrada.equals("ESTUDIANTE")) {
            precioFinal = precioBase * 0.50;
        } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
            precioFinal = precioBase * 0.60;
        } else {
            precioFinal = precioBase;
        }
        System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.printf(java.util.Locale.US, "Precio base: $%.2f; monto final: $%.2f%n", precioBase, precioFinal);
        boolean cookieSesionActiva = true;
        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";
        System.out.println("Conexión: " + estadoConexion);

        System.out.println("\nSECCIÓN 3: DÍAS DE LA SEMANA");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un día (1 = Lunes, 7 = Domingo): ");
        int dia = teclado.nextInt();
        String jornadaTradicional;
        switch (dia) {
            case 1: jornadaTradicional = "Lunes: Jornada Laboral"; break;
            case 2: jornadaTradicional = "Martes: Jornada Laboral"; break;
            case 3: jornadaTradicional = "Miércoles: Jornada Laboral"; break;
            case 4: jornadaTradicional = "Jueves: Jornada Laboral"; break;
            case 5: jornadaTradicional = "Viernes: Jornada Laboral"; break;
            case 6: jornadaTradicional = "Sábado: Fin de Semana"; break;
            case 7: jornadaTradicional = "Domingo: Fin de Semana"; break;
            default: jornadaTradicional = "Día no válido"; break;
        }
        System.out.println("Tradicional: " + jornadaTradicional);
        String jornadaModerna = switch (dia) {
            case 1 -> "Lunes: Jornada Laboral";
            case 2 -> "Martes: Jornada Laboral";
            case 3 -> "Miércoles: Jornada Laboral";
            case 4 -> "Jueves: Jornada Laboral";
            case 5 -> "Viernes: Jornada Laboral";
            case 6 -> "Sábado: Fin de Semana";
            case 7 -> "Domingo: Fin de Semana";
            default -> "Día no válido";
        };
        System.out.println("Moderno: " + jornadaModerna);

        System.out.println("\nSECCIÓN 4: CAJA");
        System.out.println("Caso A");
        calcularCompra(3, "VIP", "PROMO1 año");
        System.out.println("Caso B");
        calcularCompra(1, "NUEVO", "PROMO1 año");
        teclado.close();
    }
    public static void calcularCompra(int cantidad, String tipoCliente, String cupon) {
        double subtotalBase = cantidad * 250.00;
        double porcentajeDescuento;
        switch (tipoCliente) {
            case "VIP": porcentajeDescuento = 0.20; break;
            case "REGULAR": porcentajeDescuento = 0.10; break;
            case "NUEVO": porcentajeDescuento = 0.05; break;
            default: porcentajeDescuento = 0.0; break;
        }
        double descuentoCliente = subtotalBase * porcentajeDescuento;
        double subtotalConDescuento = subtotalBase - descuentoCliente;
        double descuentoCupon;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }
        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double total = baseImponible + iva;
        System.out.println("Cantidad: " + cantidad + "; cliente: " + tipoCliente + "; cupón: " + cupon);
        System.out.printf(java.util.Locale.US, "Subtotal base: $%.2f%n", subtotalBase);
        System.out.printf(java.util.Locale.US, "Descuento cliente: $%.2f%n", descuentoCliente);
        System.out.printf(java.util.Locale.US, "Subtotal con descuento: $%.2f%n", subtotalConDescuento);
        System.out.printf(java.util.Locale.US, "Descuento cupón: $%.2f%n", descuentoCupon);
        System.out.printf(java.util.Locale.US, "Base imponible: $%.2f%n", baseImponible);
        System.out.printf(java.util.Locale.US, "IVA: $%.2f%n", iva);
        System.out.printf(java.util.Locale.US, "Total a pagar = $%.2f%n", total);
    }
}
