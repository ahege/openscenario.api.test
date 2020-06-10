#pragma once

namespace RAC_OPENSCENARIO
{
/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * From OpenSCENARIO class model specification:
 * Instances of the types Controller, Environment, Maneuver, MiscObject, Pedestrian, Route, Trajectory and Vehicle are
 * considered as instances of type CatalogElement. Or less formal: controller, environments, maneuvers, miscellaneous
 * objects, pedestrians, routes, trajectories and vehicles are catalog elements. A catalog element is either a controller,
 * an environment, a maneuver, a miscellaneous object, a pedestrian, a route, a trajectory or a vehicle.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
    class ICatalogElement 
    {

    };
/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * From OpenSCENARIO class model specification:
 * Instances of the types ScenarioObject, EntitySelection and SpawnedObject are considered to be instances of type Entity.
 * Or less formal: scenario objects and entity selections are both entities. An entity is either a scenario object or an
 * entity selection.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
    class IEntity 
    {

    };
/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * From OpenSCENARIO class model specification:
 * An instances of SpawnedObject is considered an instance of Entity. SpawnedObject represents objects that are spawned
 * dynamically during runtime by sources and swarms. It is transient which means that it is not represented in the XSD.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
    class ISpawnedObject 
    {

    };
/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * From OpenSCENARIO class model specification:
 * Instances of the types Story, Act, Action, Event and Maneuver are considered to be instances of type StoryboardElement.
 * Or less formal: story, acts, actions, events, maneuvers are storyboard elements. A storyboard element is either a story,
 * an act, an event, an action or a maneuver.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
    class IStoryboardElement 
    {

    };
}
