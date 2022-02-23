import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion = -1;
        Empresa empresa = new Empresa();

        do {
            System.out.println("1. Registrar Trabajador");
            System.out.println("2. Listar Trabajador");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    int tipo = 0;
                    do {
                        System.out.println("Registrando trabajador");
                        System.out.println("¿De que tipo se trata?");
                        System.out.println("1/ Jefe");
                        System.out.println("2/ Asalariado");
                        System.out.println("3/ Autonomo");
                        System.out.println("4/ Volver");
                        tipo = in.nextInt();
                        switch (tipo) {
                            case 1:
                                Jefes jefe = new Jefes();
                                System.out.println("Indica su Nombre");
                                jefe.setNombre(in.next());
                                System.out.println("Indica su apellido");
                                jefe.setApellido(in.next());
                                System.out.println("Indica su DNI");
                                jefe.setDni(in.next());
                                System.out.println("Indica sus acciones");
                                jefe.setAcciones(in.nextInt());
                                System.out.println("Indica sus beneficios");
                                jefe.setBeneficios(in.nextDouble());
                                empresa.registrarTrabajador(jefe);
                                break;
                            case 2:
                                Asalariados asalariado = new Asalariados();
                                System.out.println("Indica su Nombre");
                                asalariado.setNombre(in.next());
                                System.out.println("Indica su apellido");
                                asalariado.setApellido(in.next());
                                System.out.println("Indica su DNI");
                                asalariado.setDni(in.next());
                                System.out.println("Indica su sueldo");
                                asalariado.setSueldo(in.nextInt());
                                System.out.println("Indica el numero de pagas");
                                asalariado.setNumPagas(in.nextInt());
                                System.out.println("¿Tiene contrato?");
                                asalariado.setContratado(in.hasNext());
                                empresa.registrarTrabajador(asalariado);
                                break;
                            case 3:
                                Autonomos autonomo = new Autonomos();
                                System.out.println("Indica su Nombre");
                                autonomo.setNombre(in.next());
                                System.out.println("Indica su apellido");
                                autonomo.setApellido(in.next());
                                System.out.println("Indica su DNI");
                                autonomo.setDni(in.next());
                                System.out.println("Indica su sueldo");
                                autonomo.setSueldo(in.nextInt());
                                System.out.println("¿Tiene contrato?");
                                autonomo.setContratado(in.hasNext());
                                empresa.registrarTrabajador(autonomo);
                                break;
                        }
                    } while (tipo != 4);
                    break;
                case 2:
                    System.out.println("Listando trabajadores");
                    System.out.println("¿Que clase deseas listar?");
                    System.out.println("Asalariados");
                    System.out.println("Autonomos");
                    System.out.println("Todos");
                    empresa.listarTrabajadores(in.next());
                    break;
                case 3:
                    System.out.println("Mostrando datos");
                    System.out.println("Indica el dni del trabajador");
                    for (Trabajadores empleado : empresa.listaTrabajadores) {
                        if (empleado.getDni().equalsIgnoreCase(in.next())) {
                            empleado.mostrarDatos();
                        }
                    }
                    break;
            }
        } while (opcion != 4);
    }
}
