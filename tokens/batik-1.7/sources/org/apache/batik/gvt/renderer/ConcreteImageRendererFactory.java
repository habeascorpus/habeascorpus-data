package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
renderer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ConcreteImageRendererFactory	TokenNameIdentifier
implements	TokenNameimplements
ImageRendererFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Renderer	TokenNameIdentifier
createRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
createStaticImageRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ImageRenderer	TokenNameIdentifier
createStaticImageRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
onMacOSX	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
MacRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
StaticRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ImageRenderer	TokenNameIdentifier
createDynamicImageRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
onMacOSX	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
MacRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
DynamicRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
onMacOSX	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
onMacOSX	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
"Mac OS X"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"os.name"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE