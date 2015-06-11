package com.yetu.common

import play.api.GlobalSettings
import play.api.mvc.Results.NotFound
import play.api.mvc.{ RequestHeader, Result }

import scala.concurrent.Future

trait YetuCommonGlobalSettings extends GlobalSettings {

  override def onHandlerNotFound(request: RequestHeader): Future[Result] = {
    Future.successful(NotFound(
      views.html.notfound()
    ))
  }
}
