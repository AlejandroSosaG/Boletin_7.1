package principal;
enum Genero{H, M, O}
public class Persona {
    Genero genero;
    String nombre, DNI;
    double edad, peso, altura;
    public Persona(String nombre, String DNI, Genero genero, double edad, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.genero= genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(){
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public double getEdad() {
        return edad;
    }
    public void setEdad(double edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {this.altura = altura;}

    // Creamos un subprograma que calcule el IMC.
    public double calcularIMC(){
        double IMC;
        IMC=this.peso/(this.altura*this.altura);
        return IMC;
    }
    // Creamos un subprograma que devuelva el valor 1, 0 o -1 dependiendo del IMC.
    public int comprobadorIMC(){
        double IMC= calcularIMC();
        int result;
        if (IMC<18.5){
            result=-1;
        }else if (IMC<24.9){
            result=0;
        }else result=1;
        return result;
    }
    // Creamos un subprograma que devuelva un mensaje sobre el peso de la persona dependiendo del IMC.
    public void mensajeIMC(){
        int result=comprobadorIMC();
        switch (result){
            case -1:
                System.out.println("Tiene un peso inferior al normal");
                break;
            case 0:
                System.out.println("Está en su peso ideal");
                break;
            case 1:
                System.out.println("Tiene un peso superior al normal");
                break;
        }
    }
    public void mayoriaDeEdad(){
        if (this.edad > 18){
            System.out.println("Es mayor de edad");
        }else System.out.println("Es menor de edad");
    }
}