package coreJava.Strings;

public final class ImmutableExample {
    final String idNumber;

    public ImmutableExample(String idNumber){
       this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return idNumber;
    }

    public static void main(String[] args) {
        ImmutableExample im = new ImmutableExample("52");
        System.out.println(im);

    }
}

/*    The above class is immutable because:

        The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
        The class is final so we cannot create the subclass.
        There is no setter methods i.e. we have no option to change the value of the instance variable.
        These points makes this class as immutable.**/
