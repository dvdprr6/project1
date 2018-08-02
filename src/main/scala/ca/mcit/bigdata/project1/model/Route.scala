package ca.mcit.bigdata.project1.model


case class Route(routId: Int = 0,
                 agencyId: String = null,
                 routeShortName: Int = 0,
                 routeLongName: String = null,
                 routeType: Int = 0,
                 routeUrl: String = null,
                 routeColor: String = null,
                 routeTextColor: String = null)

