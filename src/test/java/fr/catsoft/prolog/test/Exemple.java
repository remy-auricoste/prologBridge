package fr.catsoft.prolog.test;

import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Theory;
import fr.catsoft.commons.common.logger.Logger;
import fr.catsoft.commons.common.outil.FichierOutil;

/**
 * Created with IntelliJ IDEA.
 * User: remy
 * Date: 29/09/13
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 */
public class Exemple {


    public static final void main(String[] args) {
        try {
            String contenu = FichierOutil.lireFichierToString("src/test/resources/test.pro");
            Theory theory = new Theory(contenu);
            Prolog prolog = new Prolog();
            prolog.setTheory(theory);
            SolveInfo solveInfo = prolog.solve("parent(gerard,remy).");
            Logger.instance().info(solveInfo + "");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
