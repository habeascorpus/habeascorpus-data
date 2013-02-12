package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ShadowedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SynchronizedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarPoolImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
Grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CachingParserPool	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
DEFAULT_SHADOW_SYMBOL_TABLE	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
DEFAULT_SHADOW_GRAMMAR_POOL	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
SymbolTable	TokenNameIdentifier
fSynchronizedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
XMLGrammarPool	TokenNameIdentifier
fSynchronizedGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
fShadowSymbolTable	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_SHADOW_SYMBOL_TABLE	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
fShadowGrammarPool	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_SHADOW_GRAMMAR_POOL	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CachingParserPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
new	TokenNamenew
SymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLGrammarPoolImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CachingParserPool	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSynchronizedSymbolTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SynchronizedSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fSynchronizedGrammarPool	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SynchronizedGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SymbolTable	TokenNameIdentifier
getSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSynchronizedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XMLGrammarPool	TokenNameIdentifier
getXMLGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSynchronizedGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setShadowSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
shadow	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fShadowSymbolTable	TokenNameIdentifier
=	TokenNameEQUAL
shadow	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMParser	TokenNameIdentifier
createDOMParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
=	TokenNameEQUAL
fShadowSymbolTable	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ShadowedSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
fSynchronizedSymbolTable	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
fSynchronizedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
=	TokenNameEQUAL
fShadowGrammarPool	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ShadowedGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
fSynchronizedGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
fSynchronizedGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
DOMParser	TokenNameIdentifier
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SAXParser	TokenNameIdentifier
createSAXParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
=	TokenNameEQUAL
fShadowSymbolTable	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ShadowedSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
fSynchronizedSymbolTable	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
fSynchronizedSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
=	TokenNameEQUAL
fShadowGrammarPool	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
ShadowedGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
fSynchronizedGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
fSynchronizedGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
SAXParser	TokenNameIdentifier
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
SynchronizedGrammarPool	TokenNameIdentifier
implements	TokenNameimplements
XMLGrammarPool	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
XMLGrammarPool	TokenNameIdentifier
fGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SynchronizedGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
=	TokenNameEQUAL
grammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
gDesc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
gDesc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
grammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
grammars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
lockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
lockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
unlockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
unlockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
ShadowedGrammarPool	TokenNameIdentifier
extends	TokenNameextends
XMLGrammarPoolImpl	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
XMLGrammarPool	TokenNameIdentifier
fGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ShadowedGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammarPool	TokenNameIdentifier
=	TokenNameEQUAL
grammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
grammars	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
grammars	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
grammars	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
gDesc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Grammar	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
gDesc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
g	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
g	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
gDesc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
grammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
grammars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fGrammarPool	TokenNameIdentifier
.	TokenNameDOT
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
grammars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
super	TokenNamesuper
.	TokenNameDOT
containsGrammar	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
containsGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
containsGrammar	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE