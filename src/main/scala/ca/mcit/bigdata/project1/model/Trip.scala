package ca.mcit.bigdata.project1.model

case class Trip(routeId: String = null,
                serviceId: String = null,
                tripId: String = null,
                tripHeadsign: String = null,
                directionId: String = null,
                shapeId: String = null,
                wheelchairAccessible: String = null,
                noteFr: String = null,
                noteEn: String = null) extends Model