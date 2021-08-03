import java.util.*;

public class Selecao extends Controle{
	public static List<Caminhao> adicionaCaminhoes(List<Caminhao> caminhoes) {
        String tipo = "";
        int numeroDePluviometros = 0;
        List<String> listaDePluviometros = new LinkedList<>();
        
        while (!tipo.matches("Fim")) {
            tipo = leString();
            if(tipo.equals("Fim"))
                break;
            numeroDePluviometros = leInteiro();
            
            Caminhao caminhao = new Caminhao(tipo, numeroDePluviometros, listaDePluviometros);
            caminhoes.add(caminhao);

            listaDePluviometros.clear();
        }

        return caminhoes;
    }

}
