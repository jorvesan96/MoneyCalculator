package moneycalculator.view.swing;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.view.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    private Money money;

    @Override
    public void display(Money money) {
        this.money = money;
        this.removeAll();
        this.add(currency());
        this.updateUI();
    }
    
    private Component amount(){
        return new JLabel(String.valueOf(money.getAmount()));
    }
    
    private Component currency(){
        return new JLabel(money.getCurrency().getCode());
    }
}
