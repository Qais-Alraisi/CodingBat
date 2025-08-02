package warmup1;
public class posNeg{
public boolean posNeg(int a, int b, boolean negative) {
    if ((Integer.signum(a) != Integer.signum(b)) && !negative){
        return true;
    }
    if ((Integer.signum(a) == -1 && Integer.signum(b) == -1) && negative){
        return true;
    }
    return false;
}
}
