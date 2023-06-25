package teste;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
     Motoboy moto = new Motoboy("HPF-4445", "23.201.431-0", "509.145.340-76", Setor.OPERACOES, 5, Bonificacao.MOTOBOY, 1800, Genero.CONSTANTE, EstadoCivil.CASADO, LocalDate.of(2001, Month.MARCH, 15), "232", "Julio", "777-666", "gjkdwakdw@gmail.com", new Endereco("Centro", "777", "57570-970", "Cacimbinhas", UnidadeFederativa.CAJACITY));
     Caixa cx = new Caixa("29.728.629-8", "408.166.800-00", Setor.OPERACOES, 44, Bonificacao.CAIXA, 1200, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(1999, Month.MAY, 14), "232", "Andriana", "8877-6565", "sadawdwa@gmail.com", new Endereco("casa","8788", "57570-970", "Cacimbinha", UnidadeFederativa.VISTA_ALEGRE));
     Repositor rp = new Repositor("17.513.913-1", "318.168.810-07", Setor.OPERACOES, 55, Bonificacao.REPOSITOR, 3600, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(1980, Month.JANUARY, 25), "44", "Felipe", "3254-1695", "sdawdw@gmail.com", new Endereco("Residencial", "951", "47645-970", "Açudina", UnidadeFederativa.BAHIA));
     Diretor dr = new Diretor("17.795.695-1", "320.853.270-95", Setor.JURIDICO, 66, Bonificacao.CAIXA, 8000, Genero.UFBA, EstadoCivil.CASADO, LocalDate.of(1800, Month.FEBRUARY, 14), "44", "Adrianolives", "719283232", "adrianoli@gmail.com", new Endereco("Apartamento", "970", "47645-970", "Açudina", UnidadeFederativa.BAHIA));
     PrestacaoServico ps = new PrestacaoServico(LocalDate.of(1999, Month.MARCH, 30), LocalDate.of(2020, Month.AUGUST, 12), "125.458.485-1", "T3232BA", "23", "TeleentregasCaja", "8529-8572", "bruno@gmail.com", new Endereco("vendas", "434F0", "5434-322", "Salvador", UnidadeFederativa.VISTA_ALEGRE));
     Fornecedor fc = new Fornecedor("verduras", "759.865.923-4", "TED434BA", "85", "Ferrazentragfas", "7854-9658", "brupereirasilva27@gmail.com", new Endereco("Praça do Mercado, s/n", "403", "47645-970", "Açudina", UnidadeFederativa.BAHIA));
     
        System.out.println(dr);
        System.out.println("");
        dr.admitir(cx);
        System.out.println("");
        System.out.println(moto);
        System.out.println("");
        System.out.println(rp);
        System.out.println("");
        System.out.println("!! Juridicos !!");
        System.out.println(ps);
        System.out.println("");
        System.out.println(fc);
    
    }
}
