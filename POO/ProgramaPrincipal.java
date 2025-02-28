package POO;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", 24, 1.75, 66);

        pessoa1.setNome("Tony");

        System.out.println(pessoa1.getNome()); // Tony
        System.out.println(pessoa1.getIdade()); // 24
        System.out.println(pessoa1.getAltura()); // 1.75
        System.out.println(pessoa1.getPeso()); // 66.0
        System.out.println(pessoa1.getClass()); // class POO.Pessoa
        System.out.println(pessoa1.calcularImc()); // 21.551020408163264
    }
}
