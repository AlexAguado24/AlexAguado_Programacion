public class Entrada {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("ASCI",5000);
        empresa.contratarPersona(new Asalariado("Borja","Martin", "asda", 5000, Departamento.finanzas,14));
        empresa.contratarPersona(new Jefe("Isaac","Lopez","aadfdsf",6400,Departamento.ventas,15));

        empresa.listarPersonas();





    }

}
