/*
 * Caio Souza.
 * GRAPH ABOUT DYNAMIC FIBONACCI.
 * 
 */


package fibdynamic;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarGraph extends ApplicationFrame
{
    public BarGraph(String applicationTitle , String chartTitle )
   {
    super(applicationTitle);        
     
    //Create the Graphic Base.
    JFreeChart barGraph = ChartFactory.createBarChart(chartTitle, "NÚMERO A SER CALCULADO",            
     "REQUISIÇÕES DA FUNÇÃO", createGraphDataset(), PlotOrientation.VERTICAL, false, true, true);
         
      ChartPanel GraphPanel = new ChartPanel(barGraph);        
     
     //Set the size.
      GraphPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane(GraphPanel); //Necessary to show the graphic.
    }

 
    private CategoryDataset createGraphDataset()
   {   
       
       String subtitle0 =  "10";     
       String subtitle1 = "20";
       String subtitle2 =  "30";
       String subtitle3 =  "40";
       String subtitle4 = "50";
       String subtitle5 =  "60";   
       String subtitle6 =  "70";
       String subtitle7 =  "80";
       String subtitle8 =  "90";
       String subtitle9 =  "100";
       String empty = "0";

       DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
     
       
       dataset.addValue(18, empty, subtitle0);        
       dataset.addValue(28, empty, subtitle1); 
       dataset.addValue(58, empty, subtitle2); 
       dataset.addValue(78, empty, subtitle3); 
       dataset.addValue(98, empty, subtitle4);        
       dataset.addValue(118, empty, subtitle5); 
       dataset.addValue(138, empty, subtitle6); 
       dataset.addValue(158, empty, subtitle7);
       dataset.addValue(178, empty, subtitle8); 
       dataset.addValue(198, empty, subtitle9);
      
      return dataset; 
    }
     
   public void CreateGraph()
       {
          BarGraph chart = new BarGraph ("Fibonacci", "IMPLEMENTAÇÃO DINÂMICA");
          chart.pack();        
          RefineryUtilities.centerFrameOnScreen(chart); 
          chart.setVisible(true);
    
       }
}





