package pajkkx.kang.test;


public abstract class BaseCity<SELF extends BaseCity<SELF>>{

  String name;

  @SuppressWarnings("unchecked")
  public SELF setName(String name) {
    this.name = name;
    return (SELF) this; //interesting
  }

}

class PingYao extends BaseCity<PingYao>{

  String pingYaoFeature;

  public PingYao setPingYaoFeature(String pingYaoFeature) {
    this.pingYaoFeature = pingYaoFeature;
    return this;
  }


  @Override
  public String toString() {
    return "PingYao{" +
        "name='" + name + '\'' +
        ", pingYaoFeature='" + pingYaoFeature + '\'' +
        '}';
  }
}




