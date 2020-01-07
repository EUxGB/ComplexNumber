public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ComplexNumber ream = (ComplexNumber) obj;
        if (re != ream.re) return false;
        return im == ream.im;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        Double imD = new Double(im);
            int result = imD.hashCode();
        result = (int) (prime * result +re);
        return result;
    }
}