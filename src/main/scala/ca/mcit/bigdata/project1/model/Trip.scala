package ca.mcit.bigdata.project1.model

case class Trip(routeId: Int = 0,
                serviceId: String = null,
                tripHeadsign: String = null,
                directionId: Int = 0,
                shapeId: Int = 0,
                wheelchairAccessible: Int = 0,
                noteFr: Int = 0,
                noteEn:Int = 0)