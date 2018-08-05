package ca.mcit.bigdata.project1.enrich

import ca.mcit.bigdata.project1.model.CalenderDate

case class EnrichedTrip(tripRoute: TripRoute = null, calenderDate: CalenderDate = null) extends EnrichModel
