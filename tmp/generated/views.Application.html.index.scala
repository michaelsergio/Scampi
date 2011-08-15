
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String):Html = {
                            try {
                                _display_ {

format.raw/*1.16*/("""

""")+_display_(/*3.2*/main(title)/*3.13*/ {format.raw/*3.15*/("""

    <a href="/wishlist">Wishlist</a>
    <a href="/about">About</a>
    """)+_display_(/*7.6*/views/*7.11*/.defaults.html.welcome(title))+format.raw/*7.40*/("""

""")})+format.raw/*9.2*/("""

""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Fri Aug 12 00:55:09 EDT 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: ae15fc96e79b90665a060460f979641824468484
                    MATRIX: 329->1|450->15|478->18|497->29|517->31|617->106|630->111|679->140|709->143
                    LINES: 10->1|14->1|16->3|16->3|16->3|20->7|20->7|20->7|22->9
                    -- GENERATED --
                */
            
