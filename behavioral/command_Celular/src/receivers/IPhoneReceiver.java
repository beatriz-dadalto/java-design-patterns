package receivers;

public class IPhoneReceiver extends ReceiverAbstract{

  public IPhoneReceiver(String numero, String modelo, String sistemaOperacional, Cor cor) {
    this.numero = numero;
    this.modelo = modelo;
    this.sistemaOperacional = sistemaOperacional;
    this.cor = cor;
    celularLigado = false;
    whatsAppAberto = false;
    instagramAberto = false;
    emLigacao = false;
  }

  @Override
  public void mostrarConfiguracao() {
    if (seCelularLigado()) {
      System.out.println("====== CONFIGURACAO ======");
      System.out.println(toString());
      System.out.println("==========================");
    }
  }

  @Override
  public void ligarCelular() {
      celularLigado = true;
      System.out.println(modelo + " ligado.");
  }

  @Override
  public void desligarCelular() {
    if (seCelularLigado()) {
      celularLigado = false;
      System.out.println(modelo + " desligando, Volte Logo :)");
    }
  }

  @Override
  public void fazerLigacao() {
    if (seCelularLigado()) {
      emLigacao = true;
      System.out.println(modelo + " está fazendo ligacao agora.");
    }
  }

  @Override
  public void desligarLigacao() {
    if (seCelularLigado()) {
      if (seEmLigacao()) {
        emLigacao = false;
        System.out.println(modelo + " está desligando a ligacao...");
      }
    }
  }

  @Override
  public void abrirWhatsApp() {
    if (seCelularLigado()) {
      whatsAppAberto = true;
      System.out.println(modelo + " está com WhatsApp aberto agora.");
    }
  }

  @Override
  public void fecharWhatsApp() {
    if (seCelularLigado()) {
      if (seWhatsAppAberto()) {
        whatsAppAberto = false;
        System.out.println(modelo + " está com WhatsApp fechado agora.");
      }
    }
  }

  @Override
  public void abrirInstagram() {
    if (seCelularLigado()) {
      instagramAberto = true;
      System.out.println(modelo + " está com Instagram aberto agora.");
    }

  }

  @Override
  public void fecharInstagram() {
    if (seCelularLigado()) {
      if (seInstagramAberto()) {
        instagramAberto = false;
        System.out.println(modelo + " está com Instagram fechado agora.");
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Numero: '").append(numero).append('\'');
    sb.append("\nModelo: '").append(modelo).append('\'');
    sb.append("\nSistema Operacional: '").append(sistemaOperacional).append('\'');
    sb.append("\nCor: ").append(cor);
    return sb.toString();
  }
}
