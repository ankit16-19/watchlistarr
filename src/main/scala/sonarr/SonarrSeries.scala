package sonarr

private[sonarr] case class SonarrSeries(
    title: String,
    imdbId: Option[String],
    tvdbId: Option[Long],
    id: Long,
    ended: Option[Boolean]
)
