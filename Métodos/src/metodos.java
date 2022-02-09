public class metodos {

  // Outros atributos

  private final double totalValue;

  // Outros métodos

  public double calculateFee() {
    if (this.totalValue > 100) {
      return this.totalValue * 0.99;
    } else {
      return this.totalValue;
    }
  }
}
