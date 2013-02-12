package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
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
RepositorySelector	TokenNameIdentifier
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
DefaultRepositorySelector	TokenNameIdentifier
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
RootLogger	TokenNameIdentifier
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
NOPLoggerRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
Loader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
OptionConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
LogLog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LogManager	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier
=	TokenNameEQUAL
"log4j.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_XML_CONFIGURATION_FILE	TokenNameIdentifier
=	TokenNameEQUAL
"log4j.xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
public	TokenNamepublic
String	TokenNameIdentifier
DEFAULT_CONFIGURATION_KEY	TokenNameIdentifier
=	TokenNameEQUAL
"log4j.configuration"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
public	TokenNamepublic
String	TokenNameIdentifier
CONFIGURATOR_CLASS_KEY	TokenNameIdentifier
=	TokenNameEQUAL
"log4j.configuratorClass"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier
=	TokenNameEQUAL
"log4j.defaultInitOverride"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
private	TokenNameprivate
Object	TokenNameIdentifier
guard	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
static	TokenNamestatic
private	TokenNameprivate
RepositorySelector	TokenNameIdentifier
repositorySelector	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
Hierarchy	TokenNameIdentifier
h	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hierarchy	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
RootLogger	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Level	TokenNameIdentifier
)	TokenNameRPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repositorySelector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultRepositorySelector	TokenNameIdentifier
(	TokenNameLPAREN
h	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
override	TokenNameIdentifier
=	TokenNameEQUAL
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
override	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
"false"	TokenNameStringLiteral
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
override	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
configurationOptionStr	TokenNameIdentifier
=	TokenNameEQUAL
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_CONFIGURATION_KEY	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
configuratorClassName	TokenNameIdentifier
=	TokenNameEQUAL
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
CONFIGURATOR_CLASS_KEY	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
configurationOptionStr	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
Loader	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_XML_CONFIGURATION_FILE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
url	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
Loader	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
configurationOptionStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MalformedURLException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
Loader	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
configurationOptionStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
url	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Using URL ["	TokenNameStringLiteral
+	TokenNamePLUS
url	TokenNameIdentifier
+	TokenNamePLUS
"] for automatic log4j configuration."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
selectAndConfigure	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
,	TokenNameCOMMA
configuratorClassName	TokenNameIdentifier
,	TokenNameCOMMA
LogManager	TokenNameIdentifier
.	TokenNameDOT
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoClassDefFoundError	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Error during default initialization"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Could not find resource: ["	TokenNameStringLiteral
+	TokenNamePLUS
configurationOptionStr	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Default initialization of overridden by "	TokenNameStringLiteral
+	TokenNamePLUS
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier
+	TokenNamePLUS
"property."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
void	TokenNamevoid
setRepositorySelector	TokenNameIdentifier
(	TokenNameLPAREN
RepositorySelector	TokenNameIdentifier
selector	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
guard	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IllegalArgumentException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
LogManager	TokenNameIdentifier
.	TokenNameDOT
guard	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
LogManager	TokenNameIdentifier
.	TokenNameDOT
guard	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
guard	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Attempted to reset the LoggerFactory without possessing the guard."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
selector	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"RepositorySelector must be non-null."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
LogManager	TokenNameIdentifier
.	TokenNameDOT
guard	TokenNameIdentifier
=	TokenNameEQUAL
guard	TokenNameIdentifier
;	TokenNameSEMICOLON
LogManager	TokenNameIdentifier
.	TokenNameDOT
repositorySelector	TokenNameIdentifier
=	TokenNameEQUAL
selector	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
isLikelySafeScenario	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringWriter	TokenNameIdentifier
stringWriter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringWriter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ex	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
stringWriter	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
stringWriter	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
msg	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.catalina.loader.WebappClassLoader.stop"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
LoggerRepository	TokenNameIdentifier
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
repositorySelector	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
repositorySelector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultRepositorySelector	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
NOPLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
guard	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"Class invariant violation"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
"log4j called after unloading, see http://logging.apache.org/log4j/1.2/faq.html#unload."	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isLikelySafeScenario	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
repositorySelector	TokenNameIdentifier
.	TokenNameDOT
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Logger	TokenNameIdentifier
getRootLogger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRootLogger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Logger	TokenNameIdentifier
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Logger	TokenNameIdentifier
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
clazz	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Logger	TokenNameIdentifier
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
LoggerFactory	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
factory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Logger	TokenNameIdentifier
exists	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Enumeration	TokenNameIdentifier
getCurrentLoggers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getCurrentLoggers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
shutdown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
shutdown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
resetConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resetConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
