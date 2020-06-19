
public class SimuladorConexao {
    
    public static void main(String[] args) {
        
        Conexao minhaConexao = new Conexao();
        
        minhaConexao.EnviarRequisicao();        //Tentar enviar uma requisição sem antes ter conectado.
        minhaConexao.ReceberResposta();         //Tentar receber resposta sem antes ter conectado.
        minhaConexao.Conectar();                //Agora, vamos conectar.
        minhaConexao.EnviarRequisicao();        //Tentar enviar uma requisição.
        minhaConexao.ReceberResposta();         //Vamos receber resposta..
        minhaConexao.ReceberResposta();         //Tentar receber outra resposta sem ter enviado qualquer requisição.
        minhaConexao.EnviarRequisicao();        //Vamos enviar requisição novamente.
        minhaConexao.Desconectar();             //Tentar desconectar com uma requisição pendente.
        minhaConexao.ReceberResposta();         //Vamos receber a resposta pendente.
        minhaConexao.Desconectar();             //Vamos por fim, desconectar.
        
    }
}
