
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object about extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply():Html = {
                            try {
                                _display_ {

format.raw/*1.1*/("""
""")+_display_(/*2.2*/main(title="About")/*2.21*/ {format.raw/*2.23*/("""


        <h1>About Scampi</h1>
        <p>Scampi is a project dedicated to creating a package index for Scala.
           Scampi Stands for Scala's Mutable Package Index.
           It was created and is maintained by <a href="http://michael-sergio.com">Michael Sergio</a>.
        </p>
        """)+_display_(/*10.10*/views/*10.15*/.defaults.html.welcome("Welcome"))+format.raw/*10.48*/("""
""")})+format.raw/*11.2*/("""

""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Fri Aug 12 08:42:05 EDT 2011
                    SOURCE: /app/views/Application/about.scala.html
                    HASH: b33b319c6e1ac9b48a92107d9f9e2000d2793bfe
                    MATRIX: 430->0|457->2|484->21|504->23|829->321|843->326|897->359|927->361
                    LINES: 14->1|15->2|15->2|15->2|23->10|23->10|23->10|24->11
                    -- GENERATED --
                */
            
