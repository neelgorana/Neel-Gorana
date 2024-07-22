package quizPro;


class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex otherNumber) {
        double real = this.realPart + otherNumber.getRealPart();
        double imag = this.imaginaryPart + otherNumber.getImaginaryPart();
        return new Complex(real, imag);
    }

    public Complex subtract(Complex otherNumber) {
        double real = this.realPart - otherNumber.getRealPart();
        double imag = this.imaginaryPart - otherNumber.getImaginaryPart();
        return new Complex(real, imag);
    }

    public Complex multiply(Complex otherNumber) {
        double real = this.realPart * otherNumber.getRealPart() - this.imaginaryPart * otherNumber.getImaginaryPart();
        double imag = this.realPart * otherNumber.getImaginaryPart() + this.imaginaryPart * otherNumber.getRealPart();
        return new Complex(real, imag);
    }

    public Complex divide(Complex otherNumber) {
        double denominator = otherNumber.getRealPart() * otherNumber.getRealPart() + otherNumber.getImaginaryPart() * otherNumber.getImaginaryPart();
        double real = (this.realPart * otherNumber.getRealPart() + this.imaginaryPart * otherNumber.getImaginaryPart()) / denominator;
        double imag = (this.imaginaryPart * otherNumber.getRealPart() - this.realPart * otherNumber.getImaginaryPart()) / denominator;
        return new Complex(real, imag);
    }

    public double getRealPart() {
        return this.realPart;
    }
    
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }
    
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

   
    @Override
    public String toString() {
        return this.realPart + " + " + this.imaginaryPart + "i";
    }
}



	
	
	
	
	
	
	
	


