public interface IChain {
  // defines the next Object to receive the data
  // if this Object can't process it
  void setNextChain(IChain nextChain);

  // either solves the problem or passes the data
  // to the next Object in the chain
  void calculate(Number request);
}
