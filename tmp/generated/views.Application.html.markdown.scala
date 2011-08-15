
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object markdown extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(markdownHtml:String = "<p>No Content</p>"):Html = {
                            try {
                                _display_ {

format.raw/*1.45*/("""

""")+_display_(/*3.2*/main(title="Markdown")/*3.24*/ {format.raw/*3.26*/("""

    """)+_display_(/*5.6*/Html(markdownHtml))+format.raw/*5.24*/("""
""")})+format.raw/*6.2*/("""

""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Fri Aug 12 09:12:53 EDT 2011
                    SOURCE: /app/views/Application/markdown.scala.html
                    HASH: bea641511e45937d36e6382ec0f9bde61376a23f
                    MATRIX: 332->1|482->44|510->47|540->69|560->71|592->78|630->96|659->98
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|19->6
                    -- GENERATED --
                */
            
