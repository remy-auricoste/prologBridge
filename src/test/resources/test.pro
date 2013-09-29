parent(X,Y) :- pere(X,Y).
parent(X,Y) :- mere(X,Y).
male(X) :- pere(X,Y).
femelle(X) :- mere(X,Y).
pere(gerard,remy).
mere(chantal,remy).