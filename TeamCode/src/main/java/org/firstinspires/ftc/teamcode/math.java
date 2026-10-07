package org.firstinspires.ftc.teamcode;
import static org.firstinspires.ftc.teamcode.constant.j;

import org.firstinspires.ftc.teamcode.vector;
public class math {
    vector drive (double x, double y) {
        double L = Math.sqrt(y * y + x * x);
        double alf = Math.asin(y / L);
        return new vector(alf, L);
    }
    Field enc ( double a, double b, double c){
        double eldy =  (a+b)/2;
        double eldx =  c;
        double eldu = (a-b)/(2*j);
        double globaldx = eldx*(Math.cos(eldu)-Math.sin(eldu));
        double globaldy = eldy*(Math.sin(eldu)+Math.cos(eldu));
        return new Field( globaldx, globaldy);
    }
}
