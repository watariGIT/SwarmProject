package util;/** * Created by Ishiwatari on 2016/08/12. */public class Particle {    double x;    double y;    Particle(double x, double y) {        this.x = x;        this.y = y;    }    double distance(Particle p) {        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));    }}