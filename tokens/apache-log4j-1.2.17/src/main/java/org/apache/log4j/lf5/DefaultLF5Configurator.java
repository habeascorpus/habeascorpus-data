package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
PropertyConfigurator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
Configurator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggerRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultLF5Configurator	TokenNameIdentifier
implements	TokenNameimplements
Configurator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
DefaultLF5Configurator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
configure	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
resource	TokenNameIdentifier
=	TokenNameEQUAL
"/org/apache/log4j/lf5/config/defaultconfig.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
configFileResource	TokenNameIdentifier
=	TokenNameEQUAL
DefaultLF5Configurator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
configFileResource	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
PropertyConfigurator	TokenNameIdentifier
.	TokenNameDOT
configure	TokenNameIdentifier
(	TokenNameLPAREN
configFileResource	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Error: Unable to open the resource"	TokenNameStringLiteral
+	TokenNamePLUS
resource	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
doConfigure	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
LoggerRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"This class should NOT be instantiated!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
doConfigure	TokenNameIdentifier
(	TokenNameLPAREN
URL	TokenNameIdentifier
configURL	TokenNameIdentifier
,	TokenNameCOMMA
LoggerRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"This class should NOT be instantiated!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
