/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import model.ModelMenu;

public class ListMenu<E extends Object> extends JList<E> {

    private DefaultListModel defaultListModel;
    private int selectedIndex = -1;
    private int overIndex = -1;

    public ListMenu() {
        this.defaultListModel = new DefaultListModel();
        setModel(defaultListModel);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object o = defaultListModel.getElementAt(index);
                    if (o instanceof ModelMenu) {
                        ModelMenu menu = (ModelMenu) o;
                        if (menu.getType() == ModelMenu.Type.MENU) {
                            selectedIndex = index;
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }

        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                Object o = defaultListModel.getElementAt(index);
                if (o instanceof ModelMenu) {
                    ModelMenu data = (ModelMenu) o;
                    if (data.getType() == ModelMenu.Type.MENU) {
                        overIndex = index;
                    } else {
                        overIndex = -1;
                    }
                    repaint();
                }
                
            }

        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                ModelMenu data;
                if (o instanceof ModelMenu) {
                    data = (ModelMenu) o;
                } else {
                    data = new ModelMenu("", o + "", ModelMenu.Type.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addItem(ModelMenu data) {
        defaultListModel.addElement(data);
    }

}
