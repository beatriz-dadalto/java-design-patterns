package receivers;

public abstract class ReceiverAbstract implements IReceiver{
  protected String numero;
  protected String modelo;
  protected String sistemaOperacional;
  protected Cor cor; // enum
  protected static Boolean celularLigado;
  protected static Boolean whatsAppAberto;
  protected static Boolean instagramAberto;
  protected static Boolean emLigacao;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getSistemaOperacional() {
    return sistemaOperacional;
  }

  public void setSistemaOperacional(String sistemaOperacional) {
    this.sistemaOperacional = sistemaOperacional;
  }

  public Cor getCor() {
    return cor;
  }

  public void setCor(Cor cor) {
    this.cor = cor;
  }

  public static Boolean getCelularLigado() {
    return celularLigado;
  }

  public static Boolean getWhatsAppAberto() {
    return whatsAppAberto;
  }

  public static Boolean getInstagramAberto() {
    return instagramAberto;
  }

  public static Boolean getEmLigacao() {
    return emLigacao;
  }

  public boolean seCelularLigado() {
    if (!getCelularLigado()) {
      System.out.println("***** ERROR: SEU " + modelo.toUpperCase() + " ESTÁ DESLIGADO! *****");
      System.out.println("--> Você não ligou o celular antes! Tá doidão? xD");
    }
    return getCelularLigado();
  }

  public boolean seWhatsAppAberto() {
    if (!getWhatsAppAberto()) {
      System.out.println("***** ERROR: WHATSAPP ESTÁ FECHADO! *****");
      System.out.println("--> Você não abriu o whatsApp antes! xD");
    }
    return getWhatsAppAberto();
  }

  public boolean seInstagramAberto() {
    if (!getInstagramAberto()) {
      System.out.println("***** ERROR: INSTAGRAM ESTÁ FECHADO! *****");
      System.out.println("--> Você não abriu o instagram antes! xD");
    }
    return getInstagramAberto();
  }

  public boolean seEmLigacao() {
    if (!getEmLigacao()) {
      System.out.println("***** ERROR: VOCÊ NÃO ESTÁ EM UMA LIGAÇÃO! *****");
      System.out.println("--> Você não ligou pra alguém! xD");
    }
    return getEmLigacao();
  }

}
