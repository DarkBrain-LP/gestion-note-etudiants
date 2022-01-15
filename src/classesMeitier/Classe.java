package classesMeitier;

/***********************************************************************
 * Module:  Classe.java
 * Author:  M@nU_LP
 * Purpose: Defines the Class Classe
 ***********************************************************************/

import java.util.*;

/** @pdOid 4e27733e-cbd1-4270-acc0-a10817fb6ae2 */
public class Classe {
   /** @pdOid 01a02a30-8ae9-47fb-9b38-ead87de8b377 */
   private String nomCla;
   /** @pdOid f0991244-8832-42bf-9ee6-04fa50067a10 */
   private int idCla;
   
   /** @pdRoleInfo migr=no name=Matiere assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Matiere> matiere;
   /** @pdRoleInfo migr=no name=Eleve assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Eleve> eleve;
   
   /** @pdOid 8cfddbff-3dd8-4612-98b7-aa383b6ff7ba */
   public void integrerEleve() {
      // TODO: implement
   }
   
   /** @pdOid ea5c9dab-3f8b-46f2-acfc-fc1201132b53 */
   public void ajouterMatiere() {
      // TODO: implement
   }
   
   /** @pdOid 02e8cf5e-6239-47e3-af48-9fe0dc3cb01c */
   public void faireEtatMoyenne() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Matiere> getMatiere() {
      if (matiere == null)
         matiere = new java.util.HashSet<Matiere>();
      return matiere;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMatiere() {
      if (matiere == null)
         matiere = new java.util.HashSet<Matiere>();
      return matiere.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMatiere */
   public void setMatiere(java.util.Collection<Matiere> newMatiere) {
      removeAllMatiere();
      for (java.util.Iterator iter = newMatiere.iterator(); iter.hasNext();)
         addMatiere((Matiere)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatiere */
   public void addMatiere(Matiere newMatiere) {
      if (newMatiere == null)
         return;
      if (this.matiere == null)
         this.matiere = new java.util.HashSet<Matiere>();
      if (!this.matiere.contains(newMatiere))
         this.matiere.add(newMatiere);
   }
   
   /** @pdGenerated default remove
     * @param oldMatiere */
   public void removeMatiere(Matiere oldMatiere) {
      if (oldMatiere == null)
         return;
      if (this.matiere != null)
         if (this.matiere.contains(oldMatiere))
            this.matiere.remove(oldMatiere);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatiere() {
      if (matiere != null)
         matiere.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Eleve> getEleve() {
      if (eleve == null)
         eleve = new java.util.HashSet<Eleve>();
      return eleve;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEleve() {
      if (eleve == null)
         eleve = new java.util.HashSet<Eleve>();
      return eleve.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEleve */
   public void setEleve(java.util.Collection<Eleve> newEleve) {
      removeAllEleve();
      for (java.util.Iterator iter = newEleve.iterator(); iter.hasNext();)
         addEleve((Eleve)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEleve */
   public void addEleve(Eleve newEleve) {
      if (newEleve == null)
         return;
      if (this.eleve == null)
         this.eleve = new java.util.HashSet<Eleve>();
      if (!this.eleve.contains(newEleve))
         this.eleve.add(newEleve);
   }
   
   /** @pdGenerated default remove
     * @param oldEleve */
   public void removeEleve(Eleve oldEleve) {
      if (oldEleve == null)
         return;
      if (this.eleve != null)
         if (this.eleve.contains(oldEleve))
            this.eleve.remove(oldEleve);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEleve() {
      if (eleve != null)
         eleve.clear();
   }

}