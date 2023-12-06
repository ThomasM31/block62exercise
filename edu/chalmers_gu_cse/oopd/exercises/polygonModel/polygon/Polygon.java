package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;

public interface Polygon {
    Polygon translate(int x, int y);
    Polygon rotate(double radians);
    Polygon scale(double x, double y);

    Point getCenterPoint();

    // Still an issue with MVC!!
    void paint(Graphics g);

}

// TODO: Svar på uppgift/övning
// 1. Factory (implementeras av PolygonFactory)
// 2. Observer (PolygonSetAnimator är observer, )
// Composite (
// 3. Template method (Manipulated polygon)
// 4. Bridge
// 5. Decorator (AbstractPolygon är överst, ManipulatedPolygon är "decorated", både har och är en Polygon
// förändrar beteende)
// 6. Module
// 7. Facade (PolygonModel ligger mellan användare och utförarkod)
// 8. Defensive copying
// 9. MVC