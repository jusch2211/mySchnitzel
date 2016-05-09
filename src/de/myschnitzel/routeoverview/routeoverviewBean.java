package de.myschnitzel.routeoverview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jusch on 07.05.2016.
 */
public class routeoverviewBean {
    private List<String> routes;

    public routeoverviewBean(){
        this.routes = new ArrayList<>();
        routes.add("Tolle Route 27");
        routes.add("RolandRally");
    }

    public List getRoutes(){
        return routes;
    }
}
