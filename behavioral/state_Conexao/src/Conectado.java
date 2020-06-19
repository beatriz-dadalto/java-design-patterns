
public class Conectado implements IConexaoState {
    
    public Conectado()
    {
        System.out.println("Conectado");
    }

    @Override
    public void Conectar(Conexao novaConexao) {
        System.out.println("Estado inválido, não pode conectar estando conectado.");
    }

    @Override
    public void Desconectar(Conexao novaConexao) {
        
        novaConexao.setState(new Desconectado());
    }

    @Override
    public void EnviarRequisicao(Requisicao novaRequisicao, Conexao novaConexao) {
        
        novaConexao.setState(new AguardandoResposta());
    }

    @Override
    public void ReceberResposta(Conexao novaConexao) {
        System.out.println("Estado inválido, não pode receber resposta sem ter enviado requisição.");
    }
    
}
