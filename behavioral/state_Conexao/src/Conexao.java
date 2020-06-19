
public class Conexao {
   
    private IConexaoState state;
    
    public Conexao()
     {
        this.state = new Desconectado();
     }

    public void setState(IConexaoState state) {
        this.state = state;
    }
    
    public void Conectar()
    {
        this.state.Conectar(this);
    }
    
    public void Desconectar()
    {
        this.state.Desconectar(this);
    }
    
    public void EnviarRequisicao()
    {
        this.state.EnviarRequisicao(new Requisicao(), this);
    }
    
    public void ReceberResposta()
    {
        this.state.ReceberResposta(this);
    }
    
}
