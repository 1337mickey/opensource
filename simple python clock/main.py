from tkinter import *
from tkinter.ttk import *

from time import strftime

root = Tk()
root.title("Clock by 1337mickey")

def time():
    string = strftime('%H:%M:%S  %p')
    label.config(text=string)
    label.after(1000, time)
label = Label(root, font=("Arial", 50), background="black", foreground="cyan")
label.pack(anchor='center')

time()
mainloop()