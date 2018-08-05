package ca.mcit.bigdata.project1.model


case class Route(routeId: String = null,
                 agencyId: String = null,
                 routeShortName: String = null,
                 routeLongName: String = null,
                 routeType: String = null,
                 routeUrl: String = null,
                 routeColor: String = null,
                 routeTextColor: String = null) extends Model

