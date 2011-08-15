package controllers
import scala.io.Source
import java.io.File

import play._
import play.mvc._
import play.vfs.VirtualFile

import views.Application._
import org.pegdown.{PegDownProcessor, Extensions}

object Application extends Controller {

    def index = {
        html.index("Your Scala application is ready!")
    }

    def about = {
        html.about()
    }

}

object Markdown extends Controller {

    def view(filename:String = "") = {
        val filepath = "/public/markdown/" + filename + ".markdown"
        val vf = VirtualFile.fromRelativePath(filepath);
        val file = vf.getRealFile();

        val markdownStr = if (file exists) Source.fromFile(file).mkString
                          else "*No* File\n=======\n * it\n * don't\n * exist\n"
        val htmlMarkdown = new PegDownProcessor(Extensions.ALL).
                                markdownToHtml(markdownStr)
        html.markdown(htmlMarkdown)
    }

}

