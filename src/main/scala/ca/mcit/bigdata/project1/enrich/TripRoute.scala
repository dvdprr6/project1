package ca.mcit.bigdata.project1.enrich

import ca.mcit.bigdata.project1.model.{Route, Trip}

case class TripRoute(trip: Trip = null, route: Route = null) extends EnrichModel
